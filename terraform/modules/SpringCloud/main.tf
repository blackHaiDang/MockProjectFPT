provider "azurerm" {
  features {}
}

resource "azurerm_resource_group" "spring" {
  name     = "spring-resources"
  location = "West Europe"
}

resource "azurerm_application_insights" "spring" {
  name                = "tf-test-appinsights"
  location            = azurerm_resource_group.spring.location
  resource_group_name = azurerm_resource_group.spring.name
  application_type    = "web"
}

resource "azurerm_spring_cloud_service" "example" {
  name                = "springcloudterraform"
  resource_group_name = azurerm_resource_group.spring.name
  location            = azurerm_resource_group.spring.location
  sku_name            = "S0"

  config_server_git_setting {
    uri          = "https://github.com/Azure-Samples/piggymetrics"
    label        = "config"
    search_paths = ["dir1", "dir2"]
  }

  trace {
    connection_string = azurerm_application_insights.example.connection_string
    sample_rate       = 10.0
  }

  tags = {
    Env = "staging"
  }
}
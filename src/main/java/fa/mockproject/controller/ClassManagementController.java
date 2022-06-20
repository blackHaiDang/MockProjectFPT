package fa.mockproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fa.mockproject.model.ClassBatchModel;

@Controller
public class ClassManagementController {
	
	@GetMapping(value = "/ClassManagement")
	public String getClassList(Model model) {
//		ClassBatchModel classBatchModel = new ClassBatchModel();
//		classBatchModel.setLocationModel(new LocationModel());
//		classBatchModel.setBudgetCode(BudgetCodeEnum.CTC_Fresher_Allowance);
//		classBatchModel.setClassAdminModel(new ClassAdminModel());
//		
//		BudgetCodeEnum[] budgetCodeEnums = BudgetCodeEnum.values();
//		List<LocationModel> locationModels = new ArrayList<LocationModel>();
//		locationModels.add(new LocationModel(0, "Ha Noi", ""));
//		locationModels.add(new LocationModel(1, "Cau Giay", ""));
//		locationModels.add(new LocationModel(2, "HCM", ""));
//		locationModels.add(new LocationModel(3, "Da Nang", ""));
//
//		model.addAttribute("classBatchModel", classBatchModel);
//		model.addAttribute("budgetCodeEnums", budgetCodeEnums);
//		model.addAttribute("locationModels", locationModels);
//		model.addAttribute("locationTest", locationModels.get(0));
		
		return "ClassManagement";
	}
	
	@RequestMapping(value = "/addClass", method = { RequestMethod.GET, RequestMethod.POST })
	public String createNewClass(@ModelAttribute("classBatchModel") ClassBatchModel classBatchModel) {
		System.out.println(classBatchModel);
		System.out.println(classBatchModel.getBudgetCode());
		System.out.println("Hello");
		return "ClassManagement";
	}
	

}

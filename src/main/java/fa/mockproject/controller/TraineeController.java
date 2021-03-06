package fa.mockproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import fa.mockproject.entity.Trainee;
import fa.mockproject.model.TraineeModel;
import fa.mockproject.service.impl.TraineeServiceImpl;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeServiceImpl traineeService;
	
	@GetMapping(value = "/showTraineeInfo")
	public String showUpdateTrainee(Model model, @RequestParam("id") long id) {
		
		TraineeModel traineeModel = traineeService.getTraineeModel(id);
		model.addAttribute("traineeModel", traineeModel);
		
		model.addAttribute("trainee", traineeModel);
//		session.setAttribute("traineeModel", traineeModel);
		
		return "traineeInfo";
	}
	
//	@PostMapping
//	public String updateTrainee(@ModelAttribute("traineeModel") TraineeModel traineeModel, Model model,
//			@RequestParam("id") int id) {
//		
//		
//		return "redirect:/traineeList";
//	}
	
	@GetMapping(value = "/showTraineeList/{pageNo}")
	public String showTraineeList(Model model, HttpServletRequest rs,
								HttpServletRequest request,
								@RequestParam(value = "size", required = false, defaultValue = "5") String sizeStr,
								@PathVariable("pageNo") int pageNo
								) {
		
		int size = Integer.parseInt(sizeStr);  
		
		Pageable pageable = PageRequest.of(pageNo - 1 , size);
		
		List<TraineeModel> traineeModels = traineeService.getTraineeModels(pageable).getTraineeModels();
		Page<Trainee> page = traineeService.getTraineeModels(pageable).getPage();
 //		System.out.println(traineeModels.get(0));
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("trainees", traineeModels);
		return "traineeList";
	}
}

package fa.mockproject.controller;

import java.util.List;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
import javax.servlet.http.HttpServletRequest;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.web.bind.annotation.RequestParam;

import fa.mockproject.entity.Trainee;
import fa.mockproject.model.TraineeModel;
import fa.mockproject.service.impl.TraineeServiceImpl;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeServiceImpl traineeService;
	
	@GetMapping(value = "/showTraineeInfo")
	public String showUpdateTrainee(Model model, @RequestParam("id") long id, HttpSession session) {
		
		TraineeModel traineeModel = traineeService.getTraineeModel(id);
		model.addAttribute("traineeModel", traineeModel);
<<<<<<< HEAD
		session.setAttribute("traineeModel", traineeModel);
=======
		
		model.addAttribute("trainee", traineeModel);
//		session.setAttribute("traineeModel", traineeModel);
		
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		return "traineeInfo";
	}
	
	@GetMapping(value = "/updateTrainee")
	public String updateTrainee(Model model
			, HttpSession session) {
		TraineeModel traineeModel = (TraineeModel) session.getAttribute("traineeModel");
		model.addAttribute("traineeModel", traineeModel);

		return "updateTrainee";
	}
	
	@PostMapping(value = "/updateTrainee")
	public String updateTrainee(@ModelAttribute("traineeModel") TraineeModel traineeModelForm, Model model
			, HttpSession session) {
//		TraineeModel traineeModel = (TraineeModel) session.getAttribute("traineeModel");
//		model.addAttribute("traineeModel", traineeModel);
		
//		traineeService.update(traineeModelForm);

		
		return "redirect:/showTraineeList";
	}
	
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

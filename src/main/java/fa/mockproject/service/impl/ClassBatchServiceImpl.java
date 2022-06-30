package fa.mockproject.service.impl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Service;

import fa.mockproject.entity.ClassBatch;
import fa.mockproject.entity.enumtype.ClassBatchStatusEnum;
import fa.mockproject.model.ClassBatchModel;
import fa.mockproject.repository.ClassBatchRepository;
import fa.mockproject.service.ClassBatchService;
import fa.mockproject.util.ClassManagementConstant;

@Service
public class ClassBatchServiceImpl implements ClassBatchService {
	
	@Autowired
	ClassBatchRepository classBatchRepository;

	@Override
	public List<ClassBatchModel> getClassListGeneral(Map<String, String> filters) {
		
		String locationName = filters.get("loactionName");
		String className = filters.get("className");
		String statusStr = filters.get("status");
		String fromDateStr = filters.get("loactionName");
		String toDateStr = filters.get("loactionName");
		String pageSizeStr = filters.get("loactionName");
		String pageNumberStr = filters.get("loactionName");
		
		ClassBatchStatusEnum status = null;
		LocalDate fromDate = null;
		LocalDate toDate = null;
		int pageSize = ClassManagementConstant.classListPageSize.get(0);
		int pageNumber = 1;
		
		try {
			if (statusStr != null && !statusStr.equals("")) {
				status = ClassBatchStatusEnum.valueOf(statusStr);			
			}
			if (fromDateStr != null && !fromDateStr.equals("")) {
				fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));			
			}
			if (toDateStr != null && !toDateStr.equals("")) {
				toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));			
			}
			if (pageSizeStr != null && !pageSizeStr.equals("")) {
				pageSize = Integer.parseInt(pageSizeStr);			
			}
			if (pageNumberStr != null && !pageNumberStr.equals("")) {
				pageNumber = Integer.parseInt(pageNumberStr);			
			} 			
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		//...
		
		return null;
	}

	@Override
	public ClassBatchModel getClass(Long classBatchId) {
		
		ClassBatchModel classBatchModel = null;
		ClassBatch classBatch = null;
		
		try {
			
			classBatch = classBatchRepository.getOne(classBatchId);
			classBatchModel = new ClassBatchModel(classBatch);
			
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		
		return classBatchModel;
	}

	@Override
	public ClassBatchModel addClass(ClassBatchModel classBatchModel) {
		
		classBatchModel.setStatus(ClassBatchStatusEnum.Draft);
<<<<<<< HEAD
		ClassBatch classBatch = new ClassBatch(classBatchModel);
		
		try {
			classBatchRepository.save(classBatch);			
=======
		ClassBatch classBatch;
		try {
			classBatch = new ClassBatch(classBatchModel);
			classBatchRepository.save(classBatch);			
		} catch (IOException e1) {
			e1.printStackTrace();
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
		
		return classBatchModel;
	}

	@Override
	public ClassBatchModel updateDraftClass(ClassBatchModel classBatchModel) {
<<<<<<< HEAD
		ClassBatch classBatch = new ClassBatch(classBatchModel);
		
		try {
			classBatchRepository.save(classBatch);			
=======
		ClassBatch classBatch;
		try {
			classBatch = new ClassBatch(classBatchModel);
			classBatchRepository.save(classBatch);			
		} catch (IOException e1) {
			e1.printStackTrace();
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
<<<<<<< HEAD
		
=======
			
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		return classBatchModel;
	}
	
	@Override
	public ClassBatchModel updateInprogressClass(ClassBatchModel classBatchModel) {
		return classBatchModel;
		//...
	}

	@Override
	public boolean SubmitClass(Long classBatchId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StartClass(Long classBatchId) {
		// Start an accepted Class
		return false;
	}

	@Override
	public boolean FinishClass(Long classBatchId) {
		// Finish an in-progress Class
		return false;
	}

	@Override
	public boolean CancelClass(Long classBatchId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ApproveClass(Long classBatchId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RejectClass(Long classBatchId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CloseClass(Long classBatchId) {
		// Close a finished Class
		return false;
	}

	@Override
	public ClassBatchModel AcceptClass(ClassBatchModel classBatchModel) {
		ClassBatchStatusEnum planning = ClassBatchStatusEnum.Planning;
		ClassBatchStatusEnum planned = ClassBatchStatusEnum.Planned;
		LocalDateTime now = LocalDateTime.now();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String history = now + "- Approved by" + auth.getPrincipal();
		String popup = "Are you sure to accept?";
		String msg28 = " Accept successfully. ";
		SimpleMailMessage message = new SimpleMailMessage();
		
		
		if(planning != null) {	
			classBatchRepository.save(planned);
			JOptionPane.showMessageDialog(null, popup);
		}
		return classBatchModel;
	}

	@Override
	public boolean DeclineClass(Long classBatchId) {
<<<<<<< HEAD
		ClassBatchStatusEnum status = ClassBatchStatusEnum.Planning;
		if(status != null) {
			classBatchRepository.delete(null);
		}
=======
		// Decline an approved Class
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		return false;
	}

	@Override
	public boolean addTrainee(Long classBatchId, List<Long> traineeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTrainee(Long classBatchId, List<Long> traineeId) {
		// TODO Auto-generated method stub
		return false;
	}

}

package service;

import model.InternalTask;
import org.springframework.stereotype.Service;
import repository.InternalTaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InternalTaskService {

    private final InternalTaskRepository internalTaskRepository;

    public InternalTaskService(InternalTaskRepository internalTaskRepository) {
        this.internalTaskRepository = internalTaskRepository;
    }

    public List<InternalTask> getAllInternalTasks() {
        return internalTaskRepository.findAll();
    }

    public Optional<InternalTask> getInternalTaskById(Integer id) {
        return internalTaskRepository.findById(id);
    }

    public InternalTask saveOrUpdateInternalTask(InternalTask internalTask) {
        return internalTaskRepository.save(internalTask);
    }

    public void deleteInternalTaskById(Integer id) {
        internalTaskRepository.deleteById(id);
    }
}

package service;

import model.BillableTask;
import org.springframework.stereotype.Service;
import repository.BillableTaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BillableTaskService {

    private final BillableTaskRepository billableTaskRepository;

    public BillableTaskService(BillableTaskRepository billableTaskRepository) {
        this.billableTaskRepository = billableTaskRepository;
    }

    public List<BillableTask> getAllBillableTasks() {
        return billableTaskRepository.findAll();
    }

    public Optional<BillableTask> getBillableTaskById(Integer id) {
        return billableTaskRepository.findById(id);
    }

    public BillableTask saveOrUpdateBillableTask(BillableTask billableTask) {
        return billableTaskRepository.save(billableTask);
    }

    public void deleteBillableTaskById(Integer id) {
        billableTaskRepository.deleteById(id);
    }
}

package dataloader;

import model.BillableTask;
import model.InternalTask;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.BillableTaskService;
import service.InternalTaskService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final BillableTaskService billableTaskService;
    private final InternalTaskService internalTaskService;

    public DataLoader(BillableTaskService billableTaskService, InternalTaskService internalTaskService) {
        this.billableTaskService = billableTaskService;
        this.internalTaskService = internalTaskService;
    }

    @Override
    public void run(String... args) throws Exception {


        BillableTask billableTask1 = new BillableTask("Design Website", LocalDate.of(2024, 10, 20), false, 75.0);
        BillableTask billableTask2 = new BillableTask("Develop Mobile App", LocalDate.of(2024, 11, 15), false, 100.0);


        InternalTask internalTask1 = new InternalTask("Prepare Presentation", LocalDate.of(2024, 10, 25), false);
        InternalTask internalTask2 = new InternalTask("Internal Training", LocalDate.of(2024, 11, 5), false);


        billableTaskService.saveOrUpdateBillableTask(billableTask1);
        billableTaskService.saveOrUpdateBillableTask(billableTask2);


        internalTaskService.saveOrUpdateInternalTask(internalTask1);
        internalTaskService.saveOrUpdateInternalTask(internalTask2);
    }
}

package com.company.upgrade.business;

@Component
public class BusinessService {
    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int returnSum() {
        int sum = 0;

        for (int dataSet : this.dataService.getData()) {
            sum += dataSet;
        }

        return sum;
    }

}

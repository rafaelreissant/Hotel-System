package org.example.Domain.secure.staff;

import org.example.Domain.entity.factory.StafFactory;
import org.example.Domain.repository.StaffRepository;

public class StaffSection {
    private static StafFactory staffLog;

    public static void setStaffLog(StafFactory staff){
        StaffSection.staffLog = staff;
    }

    public static StafFactory getStaffLog(){
        return staffLog;
    }

    public static void cleanStaffSection(){
        staffLog = null;
    }
}

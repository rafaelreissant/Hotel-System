package org.example.Domain.secure.manager;

import org.example.Domain.entity.factory.ManagerFactory;

public class ManagerSection {
    private static ManagerFactory managerLog;

    public static void setManagerLog(ManagerFactory manager){ManagerSection.managerLog = manager;}

    public static ManagerFactory getManagerLog(){
        return managerLog;
    }

    public static void cleanManagerSection(){
        managerLog = null;
    }
}

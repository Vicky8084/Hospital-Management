package com.simpleProject.Hospital_Management.model;


public class Ward {
    private int wardId;
    private String wardName;
    private String wardType; // e.g., General, ICU, Maternity
    private int totalBeds;
    private int availableBeds;

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }

    @Override
    public String toString() {
        return "Ward{" +
                "wardId=" + wardId +
                ", wardName='" + wardName + '\'' +
                ", wardType='" + wardType + '\'' +
                ", totalBeds=" + totalBeds +
                ", availableBeds=" + availableBeds +
                '}';
    }
}

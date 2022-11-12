package busREservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getBusNo() {//accessor method
        return busNo;
    }

    public void setBusNo(int busNo) {//mutator method
        this.busNo = busNo;
    }

    public boolean getAc(){
        return ac;
    }

    public void setAc(boolean val) {
        this.ac = val;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void displayBusInfo(){
        System.out.println("Bus No=" + busNo + ", Ac=" + ac + ", Capacity=" + capacity);
    }
}

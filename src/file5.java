public class file5 {
    int noOfPersons;

    @Override
    public String toString() {
        return "file5{" +
                "noOfPersons=" + noOfPersons +
                '}';
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    public void noOfperesoncall(){
        System.out.println("you called "+this.noOfPersons+" persons");
    }
}

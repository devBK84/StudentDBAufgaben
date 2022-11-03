package org.example;


public class ComputerScienceStudent extends Student {
    private boolean isGoodInJave;

    private int IQ;

   // Lege eine Klasse ComputerScienceStudent an und lasse diese von deiner Student-Klasse erben.
   // Füge deinem ComputerScienceStudent eine zusätzliche Eigenschaft hinzu.
   // Instanziere einen ComputerScienceStudent und gib ihn aus.


    public ComputerScienceStudent(String name, int id, boolean isGoodInJave, int IQ) {
        super(name, id);
        this.isGoodInJave = isGoodInJave;
        this.IQ = IQ;
    }

    public boolean isGoodInJave() {
        return isGoodInJave;
    }

    public void setGoodInJave(boolean goodInJave) {
        isGoodInJave = goodInJave;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerScienceStudent that)) return false;
        if (!super.equals(o)) return false;

        if (isGoodInJave() != that.isGoodInJave()) return false;
        return getIQ() == that.getIQ();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isGoodInJave() ? 1 : 0);
        result = 31 * result + getIQ();
        return result;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "isGoodInJave=" + isGoodInJave +
                ", IQ=" + IQ +
                ", name='" + this.getName() + '\'' +
                ", id=" + this.getId() +
                ", Course =" + this.getCourse() +
                '}';
    }

    @Override
    public String getCourse() {
        return "ComputerScienceStudent";
    }
}

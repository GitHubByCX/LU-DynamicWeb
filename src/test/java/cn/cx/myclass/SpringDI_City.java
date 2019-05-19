package cn.cx.myclass;

public class SpringDI_City {

    private SpringDI_Person person;

    public void setPerson(SpringDI_Person person) {
        this.person = person;
    }

    public void how(){
        System.out.println("this is "+person.say()+" country.");
    }

}

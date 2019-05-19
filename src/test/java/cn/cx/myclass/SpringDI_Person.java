package cn.cx.myclass;

public class SpringDI_Person {

    private Spring_Languge languge;

    public String say(){
        this.languge.say();
        return  "";
    }

    public void setLanguge(Spring_Languge languge) {
        this.languge = languge;
    }

    public Spring_Languge getLanguge() {
        return languge;
    }
}

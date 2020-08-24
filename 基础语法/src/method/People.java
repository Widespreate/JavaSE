package method;

public class People {
    //形参
    //数组 infos = {name,place,time}
    public void sleep( MyInfo myInfo){
        System.out.println(myInfo.name+myInfo.place+"睡觉--"+myInfo.time);
    }

    public static void main(String args[]) {
        MyInfo info = new MyInfo() ;
        info.time = 23 ;
        info.place = "上海" ;
        info.name = "李四" ;
       People ls = new People() ;
        ls.sleep(info);
    }
}

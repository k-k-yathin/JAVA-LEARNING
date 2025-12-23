class Course{
    String name;
    int duration;
    float fee;
    public Course(String name, int duration, float fee) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }
    public void print(){
        System.out.println(name);
        System.out.println(duration);
        System.out.println(fee);
    }
}
class OnlineCourse extends Course{
    int courseAccessHours;
    int courseRemainingHours;
    OnlineCourse(String name,int duration,float fee,int courseAccessHours,int courseRemainingHours){
        super(name,duration,fee);
        this.courseAccessHours = courseAccessHours;
        this.courseRemainingHours = courseRemainingHours;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(courseAccessHours);
        System.out.println(courseRemainingHours);
    }
}
class OfflineCourse extends Course{
    int labAccessHours;
    int labRemainingHours;
    public OfflineCourse(String name,int duration,float fee,int labAccessHours,int labRemainingHours) {
        super(name,duration,fee);
        this.labAccessHours = labAccessHours;
        this.labRemainingHours = labRemainingHours;
    }
    @Override
    public void print(){
        super.print();
        System.out.println(labAccessHours);
        System.out.println(labRemainingHours);
    }

}
public class MethodOverriding {
    public static void main(String[] args){
        // A derived class have the same methods with exactly the same signature as base class
        // private , static and final method cannot be overridden in the child class
        OnlineCourse onlineCourse = new OnlineCourse("Yathin",100,20000,30,4);
        onlineCourse.print();
        OfflineCourse offlineCourse = new OfflineCourse("Yathin",100,20000,30,4);
        offlineCourse.print();
    }
}

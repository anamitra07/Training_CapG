package April_24th_Annotations;

public class CourseDriver {
    public static void main(String[] args) throws Exception{
        Course course = new Course();
        course.display();

        Class<?> cls = course.getClass();
        CourseInfo info = cls.getAnnotation(CourseInfo.class);
        System.out.println(info.courseName());
        System.out.println(info.duration());
    }
}

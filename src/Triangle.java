/**
 * Created by Administrator on 2016/10/27/027.
 */
public  class Triangle extends Shape {
    int hemiline = 5;
    int high = 5;
    void area (){
        area = hemiline * high / 2.0;
        System.out.println("三角形的面积是 ：" + area);
    }
}

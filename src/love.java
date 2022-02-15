public class love {
    public static void main(String[] args){
        char[] saya = {'s','a','y'};
        for(double y=30;y>-31;y--){

            for(double x=-60;x<61;x++){
                int f = (int)(((x/2)*(x/2))+Math.pow(5*y/4-2.5*(Math.pow(Math.abs(x),0.5)),2)/2);

                    if (f <= 120) {
                        System.out.print(f);
//                        int a=f%3;
//                        if(a==0) {
//                            System.out.print(saya[0]);
//                        }else if (a==1){
//                            System.out.print(saya[1]);
//                        }else {
//                            System.out.print(saya[2]);
//                        }
                    } else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
}

package thread;

/**
 * @author summer
 * @create 2022-08-29 19:12
 * @Description
 */
public class Race implements Runnable{

    /**
     * 赢家
     */
    private static String winner;

    @Override
    public void run(){
       // 遍历
        for (int i = 0; i < 101; i++) {
            String name = Thread.currentThread().getName();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!gameOver(name, i)) {
                System.out.println(name + "---> " + i);
            }
        }
    }


    /**
     * 判断比赛是否结束
     * @param name  线程名称(选手名称)
     * @param steps 步数
     * @return  true 结束 false 未结束
     */
    private boolean gameOver(String name,int steps){
        if(null != winner) return true;
        if(steps >= 100){
            winner = name;
            System.out.println(name + "赢得比赛！");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();

    }


}

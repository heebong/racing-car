package racingcar.domain;

/**
 * 자동차가 게임 도중 앞으로 전진한 횟수를 나타내는 객체.
 *
 * @author heebg
 * @version 1.0
 * @date 2019-11-20
 */
public class ForwardCount {
    private static final int INIT_COUNT = 0;

    private int count;

    public ForwardCount() {
        this.count = INIT_COUNT;
    }

    /**
     * count값을 1 증가시킨다.
     */
    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ForwardCount{" +
            "count=" + count +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForwardCount that = (ForwardCount) o;

        return count == that.count;
    }

    @Override
    public int hashCode() {
        return count;
    }
}

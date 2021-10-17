package chap06;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");// 문자열 덧붙이기
        System.out.println(sb);

        sb.insert(7, " my");// 삽입
        System.out.println(sb);

        sb.replace(8, 10, "your");// "my"를 "your"로 변경
        System.out.println(sb);

        sb.delete(8, 13);
        System.out.println(sb);

        sb.setLength(4);// 스트링 버퍼 내 문자열 길이 수정
        System.out.println(sb);// sb.toString()으로 자동 바뀜
    }
}

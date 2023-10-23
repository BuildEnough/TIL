class ExceptionTest {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("고의적 발생");
            throw e; // 예외를 발생시킴
            // throw new Exception("고의적 발생"); // 한 줄로 줄이기 가능

        } catch(Exception e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료됨");
    }
}
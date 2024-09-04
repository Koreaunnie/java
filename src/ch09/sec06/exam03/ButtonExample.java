package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현 객체 주립
        btnOk.setClickListener(new OkListener());

        // Ok 버튼 클릭하기
        btnOk.click();

        //----------------------------------------------------

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래그)
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
    }
}

class Button {
    // 정적 맴버 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
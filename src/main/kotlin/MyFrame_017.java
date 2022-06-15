import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 예제 8-1
public class MyFrame_017 extends JFrame {
    MyFrame_017() {
        setTitle("스윙 프레임 만들기"); // 제목 지정
        setSize(300, 300); // 크기 지정
        setVisible(true); // 프레임 화면 출력
    }

    public static void main(String[] args) {
        MyFrame_017 frame_017 = new MyFrame_017(); // 프레임 생성
    }
}

// 예제 8-2
class ContentPaneEx_017 extends JFrame {
    ContentPaneEx_017() {
        setTitle("8-2예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 응용프로그램 함께 종료

        Container contentPane_017 = getContentPane();
        contentPane_017.setBackground(Color.orange);
        contentPane_017.setLayout(new FlowLayout());

        contentPane_017.add(new JButton("OK"));
        contentPane_017.add(new JButton("Cancel"));
        contentPane_017.add(new JButton("Ignore"));
        setSize(300, 150);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ContentPaneEx_017();
    }
}

/*FlowLayout(JPanel, JApplet)
 * 컴포넌트 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치*/

// 예제 8-3
class FlowLayoutEx_017 extends JFrame {
    FlowLayoutEx_017() {
        setTitle("8-3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 응용 프로그램과 함께 종료
        Container cp_017 = getContentPane(); // 컨테트팬 생성

        cp_017.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽 정렬
        // cp_017.setLayout(FlowLayout); 오류

        // 컨테트팬에 버튼 추가
        cp_017.add(new JButton("add"));
        cp_017.add(new JButton("sub"));
        cp_017.add(new JButton("mul"));
        cp_017.add(new JButton("div"));
        cp_017.add(new JButton("calculate"));

        setSize(300, 250); // 크기 지정
        setVisible(true); // 보이게함 무조건 존재해야 함
    }

    public static void main(String[] args) {
        new FlowLayoutEx_017();
        // FlowLayoutEx_017(); 오류 -> new를 붙여야 함
    }
}

/*BorderLayout(JWindow, JFrame, JDialog)
 * 컨테이너 공간 5개 영역으로 나누어 배치*/

// 예제 8-4
class BorderLayoutEx_017 extends JFrame {
    BorderLayoutEx_017() {
        setTitle("8-4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 응용 프로그램과 함께 종료
        Container cp_017 = getContentPane(); // 컨테트팬 생성

        cp_017.setLayout(new BorderLayout(30, 40)); // 왼쪽 정렬
        // cp_017.setLayout(BorderLayout); 오류

        // 컨테트팬에 버튼 추가
        cp_017.add(new JButton("add"), BorderLayout.CENTER);
        cp_017.add(new JButton("sub"), BorderLayout.NORTH);
        cp_017.add(new JButton("mul"), BorderLayout.SOUTH);
        cp_017.add(new JButton("div"), BorderLayout.EAST);
        cp_017.add(new JButton("calculate"), BorderLayout.WEST);

        setSize(300, 250); // 크기 지정
        setVisible(true); // 보이게함 무조건 존재해야 함
    }

    public static void main(String[] args) {
        new BorderLayoutEx_017();
        // BorderLayoutEx_017(); 오류 -> new를 붙여야 함
    }
}

/*GridLayout
 * 2차원 간격으로 나누고 좌,우, 위, 아래로 배치*/

// 예제 8-5
class GridLayoutEx_017 extends JFrame {
    GridLayoutEx_017() {
        super("8-5 예제"); // 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp_017 = getContentPane();

        cp_017.setLayout(new GridLayout(1, 10)); // GridLayout 생성성

        for (int i = 0; i < 10; i++) { // 10개의 버튼 부착
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text);
            cp_017.add(button); // 컨텐트팬에 버튼 부착
        }
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx_017();
        // GridLayoutEx_017(); 오류 -> new를 붙여야 함
    }
}



/*배치관리자 없는 컨테이너*/

// 예제 8-6
class NullContainerEx_017 extends JFrame {
    NullContainerEx_017() {
        setTitle("8-6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp_017 = getContentPane();
        cp_017.setLayout(null); // 컨테트팬 배치관리자 제거

        JLabel la_017 = new JLabel("Hello");
        la_017.setLocation(130, 50); // 위치 지정
        la_017.setSize(200, 20); // 크기 지정
        cp_017.add(la_017); // 컨테트팬에 부착

        for (int i = 0; i < 10; i++) {
            JButton b_017 = new JButton(Integer.toString(i));
            b_017.setLocation(i * 15, i * 15);
            b_017.setSize(50, 20);
            cp_017.add(b_017);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx_017();
        // NullContainerEx_017(); 오류 -> new를 붙여야 함
    }
}

// 예제 9-1
class IndepClassListener_017 extends JFrame {
    IndepClassListener_017() {
        setTitle("9-1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane(); // 판넬 생성
        c_017.setLayout(new FlowLayout()); // 플로우 레이아웃 배치

        JButton btn_017 = new JButton("Action"); //버튼 생성
        btn_017.addActionListener(new MyActionListener_017()); //버튼에 대한 행동을 추가. 독립 클래스 작성

        c_017.add(btn_017);
        setSize(250, 120);
        setVisible(true);


    }

    public static void main(String[] args) {
        new IndepClassListener_017();
    }
}

/* 독립된 클래스
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener_017 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b_017 = (JButton) e.getSource();
        if (b_017.getText().equals("Action")) {
            b_017.setText("액션");
        } else {
            b_017.setText("Action");
        }
    }
}*/

// 예제 9-2
class InnerClassListener_017 extends JFrame {
    InnerClassListener_017() {
        setTitle("9-2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane(); // 판넬 생성
        c_017.setLayout(new FlowLayout()); // 플로우 레이아웃 배치

        JButton btn_017 = new JButton("Action"); //버튼 생성
        btn_017.addActionListener(new MyActionListener_017()); //버튼에 대한 행동을 추가. 독립 클래스 작성

        c_017.add(btn_017);
        setSize(250, 120);
        setVisible(true);

    }

    public class MyActionListener_017 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b_017 = (JButton) e.getSource();
            if (b_017.getText().equals("Action")) {
                b_017.setText("액션");
            } else {
                b_017.setText("Action");
                setTitle(b_017.getText());
            }
        }
    }


    public static void main(String[] args) {
        new InnerClassListener_017();
    }
}


// 예제 9-3
class AnonymousClassListener_017 extends JFrame {
    AnonymousClassListener_017() {
        setTitle("9-3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane(); // 판넬 생성
        c_017.setLayout(new FlowLayout()); // 플로우 레이아웃 배치

        JButton btn_017 = new JButton("Action"); //버튼 생성
        c_017.add(btn_017);

        // 익명 클래스 작성
        btn_017.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b_017 = (JButton) e.getSource();
                if (b_017.getText().equals("Action")) {
                    b_017.setText("액션");
                } else {
                    b_017.setText("Action");
                    setTitle(b_017.getText());
                }
            }
        });
        setSize(250, 120);
        setVisible(true);


    }

    public static void main(String[] args) {
        new AnonymousClassListener_017();
    }
}


//예제 9-4
class MouseListenerEx_017 extends JFrame {
    JLabel la_017 = new JLabel("Hello");

    MouseListenerEx_017() {
        setTitle("9-4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane(); // 판넬 생성
        c_017.addMouseListener(new MyMouseListener_017());
        c_017.setLayout(null); // 플로우 레이아웃 배치

        la_017.setSize(50, 20);
        la_017.setLocation(50, 20);
        c_017.add(la_017);

        setSize(250, 120);
        setVisible(true);
    }

    class MyMouseListener_017 implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x_017 = e.getX();
            int y_017 = e.getY();
            la_017.setLocation(x_017, y_017);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    } // 마우스 리스너는 implements 사용

    public static void main(String[] args) {
        new MouseListenerEx_017();
    }
}


//예제 9-5
class MouseAdapterEx_017 extends JFrame {
    JLabel la_017 = new JLabel("Hello");

    MouseAdapterEx_017() {
        setTitle("9-5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane(); // 판넬 생성
        c_017.addMouseListener(new MyMouseAdapter_017());

        c_017.setLayout(null); // 플로우 레이아웃 배치
        la_017.setSize(50, 20);
        la_017.setLocation(50, 20);
        c_017.add(la_017);

        setSize(250, 120);
        setVisible(true);
    }

    class MyMouseAdapter_017 extends MouseAdapter { //마우스 어뎁터는 extends 사용
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x_017 = e.getX();
            int y_017 = e.getY();
            la_017.setLocation(x_017, y_017);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new MouseAdapterEx_017();
    }
}

// 예제 9-6
class KeyCharEx_017 extends JFrame {
    JLabel la_017 = new JLabel("9-6");

    KeyCharEx_017() {
        super("9-6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane();
        c_017.setLayout(new FlowLayout());
        c_017.add(la_017);
        c_017.addKeyListener(new MyKeyListener_017());
        setSize(250, 150);
        setVisible(true);
        c_017.setFocusable(true); // 포커스를 받을 수 있도록 설정

        c_017.requestFocus(); // 컨텐트팬에 포커스 설정
    }

    class MyKeyListener_017 extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int r_017 = (int) (Math.random() * 256);
            int g_017 = (int) (Math.random() * 256);
            int b_017 = (int) (Math.random() * 256);

            switch (e.getKeyChar()) { // 입력된 키 문자
                case '\n': // <Enter> 키 입력
                    la_017.setText("r_017=" + r_017 + ", g_017=" + g_017 + ", b_017=" + b_017);
                    getContentPane().setBackground(
                            new Color(r_017, g_017, b_017));
                    break;
                case 'q': // q를 입력하면 종료
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharEx_017();
    }
}

//예제 9-7
class FlyingTextEx_017 extends JFrame {
    JLabel la_017 = new JLabel("9-6");

    FlyingTextEx_017() {
        super("9-7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane();
        c_017.setLayout(null);
        c_017.add(la_017);
        c_017.addKeyListener(new MyKeyListener_017());

        la_017.setLocation(50, 50);
        la_017.setSize(100, 20);
        c_017.add(la_017);

        setSize(250, 150);
        setVisible(true);

        c_017.requestFocus(); // 컨텐트팬에 포커스 설정
    }

    class MyKeyListener_017 extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode_017 = e.getKeyCode(); // 입력된 키코드
            switch (keyCode_017) {
                case KeyEvent.VK_UP:
                    la_017.setLocation(la_017.getX(), la_017.getY() - 10);
                    break;
                case KeyEvent.VK_DOWN:
                    la_017.setLocation(la_017.getX(), la_017.getY() + 10);
                    break;
                case KeyEvent.VK_LEFT:
                    la_017.setLocation(la_017.getX() - 10, la_017.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la_017.setLocation(la_017.getX() + 10, la_017.getY());
                    break;

            }
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx_017();
    }
}


//마우스 이벤트 처리 예 1 ~ 8
class MouseEventAllEx_017 extends JFrame {
    JLabel la_017 = new JLabel(" Move Me");

    MouseEventAllEx_017() {
        setTitle("예제 8개");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c_017 = getContentPane();
        MyMouseListener listener = new MyMouseListener();
        c_017.addMouseListener(listener);
        c_017.addMouseMotionListener(listener);

        c_017.setLayout(null);

        la_017.setSize(80, 20);
        la_017.setLocation(100, 80);
        c_017.add(la_017); // 레이블 컴포넌트 삽입

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la_017.setLocation(e.getX(), e.getY());
            setTitle("mousePressed("+e.getX()+","+e.getY()+")");
        }
        public void mouseReleased(MouseEvent e) {
            la_017.setLocation(e.getX(), e.getY());
            setTitle("mouseReleased("+e.getX()+","+e.getY()+")");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            Component comp_017 = (Component)e.getSource();
            comp_017.setBackground(Color.CYAN);
        }
        public void mouseExited(MouseEvent e) {
            Component comp_017 = (Component)e.getSource();
            comp_017.setBackground(Color.YELLOW);
        }
        public void mouseDragged(MouseEvent e) {
            la_017.setLocation(e.getX(), e.getY());
            setTitle("mouseDragged("+e.getX()+","+e.getY()+")");
        }
        public void mouseMoved(MouseEvent e) {
            la_017.setLocation(e.getX(), e.getY());
            setTitle("mouseMoved ("+e.getX()+","+e.getY()+")");
        }
    }

        public static void main(String[] args) {
            new MouseEventAllEx_017();
        }

    }

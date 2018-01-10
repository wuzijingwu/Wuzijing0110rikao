package text.bwei.com.wuzijing0110rikao.mine.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import text.bwei.com.wuzijing0110rikao.R;
import text.bwei.com.wuzijing0110rikao.mine.bean.LoginBean;

public class ExitActivity extends AppCompatActivity {

    @BindView(R.id.btn_exit)
    Button btnExit;
    @BindView(R.id.use_name)
    TextView useName;
    @BindView(R.id.btn_name)
    Button btnName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
        ButterKnife.bind(this);
        SharedPreferences sp = getSharedPreferences("USER", MODE_PRIVATE);
        LoginBean.DataBean dataBean = new LoginBean.DataBean();
        useName.setText(sp.getString("name", dataBean.getUsername()));
    }

    @OnClick(R.id.btn_exit)
    public void onViewClicked() {
        SharedPreferences user = getSharedPreferences("USER", MODE_PRIVATE);
        user.edit().clear().commit();
        finish();
    }
}
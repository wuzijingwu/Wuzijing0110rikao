package text.bwei.com.wuzijing0110rikao.mine;


import text.bwei.com.wuzijing0110rikao.mine.bean.LoginBean;

public interface LoginConstract {

    interface ILoginView {
        void showLogin(LoginBean.DataBean db);
        void showerroe(String e);
    }

    interface ILoginModel {
        void RequestData(String url, String mobile, String password, OnRequestListener onRequestListener);
    }

    interface OnRequestListener{
        void OnSuccess(LoginBean.DataBean db);
        void OnError(String e);
    }

    interface ILoginPresenter {
        void onSignUp(String url, String mobile, String password);
    }

}
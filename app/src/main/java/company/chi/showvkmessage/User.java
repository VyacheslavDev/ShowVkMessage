package company.chi.showvkmessage;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private String name;
    private String email;
    private boolean isOnline;

    public User(String name, String email, boolean isOnline) {
        this.name = name;
        this.email = email;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}

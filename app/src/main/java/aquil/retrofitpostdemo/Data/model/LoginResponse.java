package aquil.retrofitpostdemo.Data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aquil on 10/5/2017.
 */
public class LoginResponse {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("outletId")
    @Expose
    private Integer outletId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("msg")
    @Expose
    private String msg;

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginResponse() {
    }

    /**
     *
     * @param lastName
     * @param status
     * @param email
     * @param outletId
     * @param userId
     * @param firstName
     * @param msg
     */
    public LoginResponse(Integer userId, String firstName, String lastName, String email, Integer outletId, String status, String msg) {
        super();
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.outletId = outletId;
        this.status = status;
        this.msg = msg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOutletId() {
        return outletId;
    }

    public void setOutletId(Integer outletId) {
        this.outletId = outletId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}

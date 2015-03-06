package org.springframework.social.odnoklassniki.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Anton Rudenko.
 * uid - идентификатор пользователя
    locale - язык пользователя
    first_name - имя пользователя
    last_name - фамилия пользователя
    name - совмещение имени и фамилии для отображения
    gender - пол
    age - возраст пользователя
    birthday - дата рождения
    has_email - true/false имеет или не имеет адрес эл. почты
    current_status - текущий статус
    current_status_id - id текущего статуса
    current_status_date - дата установки текущего статуса
    online - находится ли в онлайне
    photo_id - id главной фотографии
    pic_1 - то же что и pic50x50
    pic_2 - то же что и pic128max
    pic_3 - то же что и pic190x190
    pic_4 - то же что и pic640x480
    pic_5 - то же что и pic128x128
    pic50x50 - квадратная аватарка 50x50
    pic128x128 - квадратная аватарка 128x128
    pic128max - аватарка, вписанная в квадрат 128x128
    pic180min - аватарка, заресайзенная по минимальной стороне 180
    pic240min - аватарка, заресайзенная по минимальной стороне 240
    pic320min - аватарка, заресайзенная по минимальной стороне 320
    pic190x190 - квадратная аватарка 190x190
    pic640x480 - аватарка, вписанная в квадрат 640x480
    pic1024x768 - аватарка, вписанная в квадрат 1024x768
    location- расположение
    city - город
    country - страна
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OdnoklassnikiProfile {
    private String uid;
    private String locale;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    private String name;
    private String gender;
    private Integer age;
    private String birthday;
    @JsonProperty("has_email")
    private Boolean hasEmail;
    @JsonProperty("current_status")
    private String currentStatus;
    @JsonProperty("current_status_id")
    private String currentStatusId;
    @JsonProperty("current_status_date")
    private String currentStatusDate;
    private String online;
    @JsonProperty("photo_id")
    private String photoId;
    @JsonProperty("pic_1")
    private String pic1;
    @JsonProperty("pic_2")
    private String pic2;
    @JsonProperty("pic_3")
    private String pic3;
    @JsonProperty("pic_4")
    private String pic4;
    @JsonProperty("pic_5")
    private String pic5;
    private String pic50x50;
    private String pic128x128;
    private String pic128max;
    private String pic180min;
    private String pic240min;
    private String pic320min;
    private String pic190x190;
    private String pic640x480;
    private String pic1024x768;
    @JsonProperty("location")
    private OdnoklassnikiProfileLocation location;
    private String city;
    private String country;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getHasEmail() {
        return hasEmail;
    }

    public void setHasEmail(Boolean hasEmail) {
        this.hasEmail = hasEmail;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentStatusId() {
        return currentStatusId;
    }

    public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }

    public String getCurrentStatusDate() {
        return currentStatusDate;
    }

    public void setCurrentStatusDate(String currentStatusDate) {
        this.currentStatusDate = currentStatusDate;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5;
    }

    public String getPic50x50() {
        return pic50x50;
    }

    public void setPic50x50(String pic50x50) {
        this.pic50x50 = pic50x50;
    }

    public String getPic128x128() {
        return pic128x128;
    }

    public void setPic128x128(String pic128x128) {
        this.pic128x128 = pic128x128;
    }

    public String getPic128max() {
        return pic128max;
    }

    public void setPic128max(String pic128max) {
        this.pic128max = pic128max;
    }

    public String getPic180min() {
        return pic180min;
    }

    public void setPic180min(String pic180min) {
        this.pic180min = pic180min;
    }

    public String getPic240min() {
        return pic240min;
    }

    public void setPic240min(String pic240min) {
        this.pic240min = pic240min;
    }

    public String getPic320min() {
        return pic320min;
    }

    public void setPic320min(String pic320min) {
        this.pic320min = pic320min;
    }

    public String getPic190x190() {
        return pic190x190;
    }

    public void setPic190x190(String pic190x190) {
        this.pic190x190 = pic190x190;
    }

    public String getPic640x480() {
        return pic640x480;
    }

    public void setPic640x480(String pic640x480) {
        this.pic640x480 = pic640x480;
    }

    public String getPic1024x768() {
        return pic1024x768;
    }

    public void setPic1024x768(String pic1024x768) {
        this.pic1024x768 = pic1024x768;
    }

    public OdnoklassnikiProfileLocation getLocation() {
        return location;
    }

    public void setLocation(OdnoklassnikiProfileLocation location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}

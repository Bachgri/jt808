package org.yzh.protocol.t808;

import io.github.yezhihao.protostar.annotation.Field;
import io.github.yezhihao.protostar.annotation.Message;
import org.yzh.protocol.basics.JTMessage;
import org.yzh.protocol.commons.JT808;
import org.yzh.protocol.commons.transform.AttributeConverter;
import org.yzh.protocol.commons.transform.AttributeConverterYue;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author yezhihao
 * https://gitee.com/yezhihao/jt808-server
 */
@Message(JT808.位置信息汇报)
public class T0200 extends JTMessage {

	/**
     * Utilisez Bit.isTrue pour évaluer les bits d'alarme et d'indicateur d'état
     * @voir org.yzh.protocol.commons.Bit
     */
    @Field(length = 4, desc = "signe d'alarme")
    private int warnBit;
    @Field(length = 4, desc = "Statut")
    private int statusBit;
    @Field(length = 4, desc = "Latitude")
    private int latitude;
    @Field(length = 4, desc = "Longitude")
    private int longitude;
    @Field(length = 2, desc = "Metre")
    private int altitude;
    @Field(length = 2, desc = "vitesse (1/10 km/h)")
    private int speed;
    @Field(length = 2, desc = "Direction")
    private int direction;
    @Field(length = 6, charset = "BCD", desc = "time(YYMMDDHHMMSS)")
    private LocalDateTime deviceTime;
    @Field(converter = AttributeConverter.class, desc = "Informations supplémentaires sur l'emplacement", version = {-1, 0})
    @Field(converter = AttributeConverterYue.class, desc = "Informations de localisation supplémentaires (norme cantonaise)", version = 1)
    private Map<Integer, Object> attributes;

    public int getWarnBit() {
        return warnBit;
    }

    public void setWarnBit(int warnBit) {
        this.warnBit = warnBit;
    }

    public int getStatusBit() {
        return statusBit;
    }

    public void setStatusBit(int statusBit) {
        this.statusBit = statusBit;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public LocalDateTime getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(LocalDateTime deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Map<Integer, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<Integer, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = toStringHead();
        sb.append("T0200{deviceTime=").append(deviceTime);
        sb.append(",longitude=").append(longitude);
        sb.append(",latitude=").append(latitude);
        sb.append(",altitude=").append(altitude);
        sb.append(",speed=").append(speed);
        sb.append(",direction=").append(direction);
        sb.append(",warnBit=").append(Integer.toBinaryString(warnBit));
        sb.append(",statusBit=").append(Integer.toBinaryString(statusBit));
        sb.append(",attributes=").append(attributes);
        sb.append('}');
        return sb.toString();
    }
}
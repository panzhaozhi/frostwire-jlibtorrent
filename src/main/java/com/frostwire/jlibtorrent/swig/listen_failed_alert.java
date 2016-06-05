/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class listen_failed_alert extends alert {
  private transient long swigCPtr;

  protected listen_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.listen_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(listen_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_listen_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.listen_failed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.listen_failed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.listen_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.listen_failed_alert_message(swigCPtr, this);
  }

  public String listen_interface() {
    return libtorrent_jni.listen_failed_alert_listen_interface(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.listen_failed_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.listen_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setOperation(int value) {
    libtorrent_jni.listen_failed_alert_operation_set(swigCPtr, this, value);
  }

  public int getOperation() {
    return libtorrent_jni.listen_failed_alert_operation_get(swigCPtr, this);
  }

  public void setSock_type(listen_failed_alert.socket_type_t value) {
    libtorrent_jni.listen_failed_alert_sock_type_set(swigCPtr, this, value.swigValue());
  }

  public listen_failed_alert.socket_type_t getSock_type() {
    return listen_failed_alert.socket_type_t.swigToEnum(libtorrent_jni.listen_failed_alert_sock_type_get(swigCPtr, this));
  }

  public void setAddress(address value) {
    libtorrent_jni.listen_failed_alert_address_set(swigCPtr, this, address.getCPtr(value), value);
  }

  public address getAddress() {
    long cPtr = libtorrent_jni.listen_failed_alert_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public void setPort(int value) {
    libtorrent_jni.listen_failed_alert_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.listen_failed_alert_port_get(swigCPtr, this);
  }

  public final static class socket_type_t {
    public final static listen_failed_alert.socket_type_t tcp = new listen_failed_alert.socket_type_t("tcp");
    public final static listen_failed_alert.socket_type_t tcp_ssl = new listen_failed_alert.socket_type_t("tcp_ssl");
    public final static listen_failed_alert.socket_type_t udp = new listen_failed_alert.socket_type_t("udp");
    public final static listen_failed_alert.socket_type_t i2p = new listen_failed_alert.socket_type_t("i2p");
    public final static listen_failed_alert.socket_type_t socks5 = new listen_failed_alert.socket_type_t("socks5");
    public final static listen_failed_alert.socket_type_t utp_ssl = new listen_failed_alert.socket_type_t("utp_ssl");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static socket_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + socket_type_t.class + " with value " + swigValue);
    }

    private socket_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private socket_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private socket_type_t(String swigName, socket_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static socket_type_t[] swigValues = { tcp, tcp_ssl, udp, i2p, socks5, utp_ssl };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int priority = libtorrent_jni.listen_failed_alert_priority_get();
  public final static int alert_type = libtorrent_jni.listen_failed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.listen_failed_alert_static_category_get();
  public final static class op_t {
    public final static listen_failed_alert.op_t parse_addr = new listen_failed_alert.op_t("parse_addr");
    public final static listen_failed_alert.op_t open = new listen_failed_alert.op_t("open");
    public final static listen_failed_alert.op_t bind = new listen_failed_alert.op_t("bind");
    public final static listen_failed_alert.op_t listen = new listen_failed_alert.op_t("listen");
    public final static listen_failed_alert.op_t get_socket_name = new listen_failed_alert.op_t("get_socket_name");
    public final static listen_failed_alert.op_t accept = new listen_failed_alert.op_t("accept");
    public final static listen_failed_alert.op_t enum_if = new listen_failed_alert.op_t("enum_if");
    public final static listen_failed_alert.op_t bind_to_device = new listen_failed_alert.op_t("bind_to_device");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static op_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + op_t.class + " with value " + swigValue);
    }

    private op_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private op_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private op_t(String swigName, op_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static op_t[] swigValues = { parse_addr, open, bind, listen, get_socket_name, accept, enum_if, bind_to_device };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}

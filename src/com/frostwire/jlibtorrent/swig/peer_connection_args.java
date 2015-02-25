/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_connection_args {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peer_connection_args(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_connection_args obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_connection_args(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSes(SWIGTYPE_p_libtorrent__aux__session_interface value) {
    libtorrent_jni.peer_connection_args_ses_set(swigCPtr, this, SWIGTYPE_p_libtorrent__aux__session_interface.getCPtr(value));
  }

  public SWIGTYPE_p_libtorrent__aux__session_interface getSes() {
    long cPtr = libtorrent_jni.peer_connection_args_ses_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_libtorrent__aux__session_interface(cPtr, false);
  }

  public void setSett(SWIGTYPE_p_libtorrent__aux__session_settings value) {
    libtorrent_jni.peer_connection_args_sett_set(swigCPtr, this, SWIGTYPE_p_libtorrent__aux__session_settings.getCPtr(value));
  }

  public SWIGTYPE_p_libtorrent__aux__session_settings getSett() {
    long cPtr = libtorrent_jni.peer_connection_args_sett_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_libtorrent__aux__session_settings(cPtr, false);
  }

  public void setStats_counters(SWIGTYPE_p_libtorrent__counters value) {
    libtorrent_jni.peer_connection_args_stats_counters_set(swigCPtr, this, SWIGTYPE_p_libtorrent__counters.getCPtr(value));
  }

  public SWIGTYPE_p_libtorrent__counters getStats_counters() {
    long cPtr = libtorrent_jni.peer_connection_args_stats_counters_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_libtorrent__counters(cPtr, false);
  }

  public void setS(SWIGTYPE_p_boost__shared_ptrT_socket_type_t value) {
    libtorrent_jni.peer_connection_args_s_set(swigCPtr, this, SWIGTYPE_p_boost__shared_ptrT_socket_type_t.getCPtr(value));
  }

  public SWIGTYPE_p_boost__shared_ptrT_socket_type_t getS() {
    long cPtr = libtorrent_jni.peer_connection_args_s_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_boost__shared_ptrT_socket_type_t(cPtr, false);
  }

  public void setEndp(tcp_endpoint value) {
    libtorrent_jni.peer_connection_args_endp_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getEndp() {
    long cPtr = libtorrent_jni.peer_connection_args_endp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setPeerinfo(torrent_peer value) {
    libtorrent_jni.peer_connection_args_peerinfo_set(swigCPtr, this, torrent_peer.getCPtr(value), value);
  }

  public torrent_peer getPeerinfo() {
    long cPtr = libtorrent_jni.peer_connection_args_peerinfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_peer(cPtr, false);
  }

  public peer_connection_args() {
    this(libtorrent_jni.new_peer_connection_args(), true);
  }

}

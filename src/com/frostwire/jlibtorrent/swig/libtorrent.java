/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static boolean op_eq(address a1, address a2) {
    return libtorrent_jni.op_eq__SWIG_0(address.getCPtr(a1), a1, address.getCPtr(a2), a2);
  }

  public static boolean op_neq(address a1, address a2) {
    return libtorrent_jni.op_neq__SWIG_0(address.getCPtr(a1), a1, address.getCPtr(a2), a2);
  }

  public static boolean op_lt(address a1, address a2) {
    return libtorrent_jni.op_lt__SWIG_0(address.getCPtr(a1), a1, address.getCPtr(a2), a2);
  }

  public static boolean op_gt(address a1, address a2) {
    return libtorrent_jni.op_gt__SWIG_0(address.getCPtr(a1), a1, address.getCPtr(a2), a2);
  }

  public static boolean op_eq(address_v4 a1, address_v4 a2) {
    return libtorrent_jni.op_eq__SWIG_1(address_v4.getCPtr(a1), a1, address_v4.getCPtr(a2), a2);
  }

  public static boolean op_neq(address_v4 a1, address_v4 a2) {
    return libtorrent_jni.op_neq__SWIG_1(address_v4.getCPtr(a1), a1, address_v4.getCPtr(a2), a2);
  }

  public static boolean op_lt(address_v4 a1, address_v4 a2) {
    return libtorrent_jni.op_lt__SWIG_1(address_v4.getCPtr(a1), a1, address_v4.getCPtr(a2), a2);
  }

  public static boolean op_gt(address_v4 a1, address_v4 a2) {
    return libtorrent_jni.op_gt__SWIG_1(address_v4.getCPtr(a1), a1, address_v4.getCPtr(a2), a2);
  }

  public static boolean op_eq(address_v6 a1, address_v6 a2) {
    return libtorrent_jni.op_eq__SWIG_2(address_v6.getCPtr(a1), a1, address_v6.getCPtr(a2), a2);
  }

  public static boolean op_neq(address_v6 a1, address_v6 a2) {
    return libtorrent_jni.op_neq__SWIG_2(address_v6.getCPtr(a1), a1, address_v6.getCPtr(a2), a2);
  }

  public static boolean op_lt(address_v6 a1, address_v6 a2) {
    return libtorrent_jni.op_lt__SWIG_2(address_v6.getCPtr(a1), a1, address_v6.getCPtr(a2), a2);
  }

  public static boolean op_gt(address_v6 a1, address_v6 a2) {
    return libtorrent_jni.op_gt__SWIG_2(address_v6.getCPtr(a1), a1, address_v6.getCPtr(a2), a2);
  }

  public static boolean op_eq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_eq(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_lt(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static error_code make_error_code(error_code_enum e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static error_category get_libtorrent_category() {
    return new error_category(libtorrent_jni.get_libtorrent_category(), false);
  }

  public static error_category get_http_category() {
    return new error_category(libtorrent_jni.get_http_category(), false);
  }

  public static error_category get_system_category() {
    return new error_category(libtorrent_jni.get_system_category(), false);
  }

  public static error_category get_posix_category() {
    return new error_category(libtorrent_jni.get_posix_category(), false);
  }

  public static error_category generic_category() {
    return new error_category(libtorrent_jni.generic_category(), false);
  }

  public static void throw_type_error() {
    libtorrent_jni.throw_type_error();
  }

  public static storage_interface default_storage_constructor(file_storage arg0, file_storage mapped, String arg2, file_pool arg3, unsigned_char_vector arg4) {
    long cPtr = libtorrent_jni.default_storage_constructor(file_storage.getCPtr(arg0), arg0, file_storage.getCPtr(mapped), mapped, arg2, file_pool.getCPtr(arg3), arg3, unsigned_char_vector.getCPtr(arg4), arg4);
    return (cPtr == 0) ? null : new storage_interface(cPtr, false);
  }

  public static storage_interface disabled_storage_constructor(file_storage arg0, file_storage mapped, String arg2, file_pool arg3, unsigned_char_vector arg4) {
    long cPtr = libtorrent_jni.disabled_storage_constructor(file_storage.getCPtr(arg0), arg0, file_storage.getCPtr(mapped), mapped, arg2, file_pool.getCPtr(arg3), arg3, unsigned_char_vector.getCPtr(arg4), arg4);
    return (cPtr == 0) ? null : new storage_interface(cPtr, false);
  }

  public static long_long_long_2_pair_vector get_filesizes(file_storage t, String p) {
    return new long_long_long_2_pair_vector(libtorrent_jni.get_filesizes(file_storage.getCPtr(t), t, p), true);
  }

  public static long peer_priority(SWIGTYPE_p_tcp__endpoint e1, SWIGTYPE_p_tcp__endpoint e2) {
    return libtorrent_jni.peer_priority(SWIGTYPE_p_tcp__endpoint.getCPtr(e1), SWIGTYPE_p_tcp__endpoint.getCPtr(e2));
  }

  public static void request_a_block(torrent t, peer_connection c) {
    libtorrent_jni.request_a_block(torrent.getCPtr(t), t, peer_connection.getCPtr(c), c);
  }

  public static int merkle_num_leafs(int arg0) {
    return libtorrent_jni.merkle_num_leafs(arg0);
  }

  public static int merkle_num_nodes(int arg0) {
    return libtorrent_jni.merkle_num_nodes(arg0);
  }

  public static int merkle_get_parent(int arg0) {
    return libtorrent_jni.merkle_get_parent(arg0);
  }

  public static int merkle_get_sibling(int arg0) {
    return libtorrent_jni.merkle_get_sibling(arg0);
  }

  public static void trim_path_element(String path_element) {
    libtorrent_jni.trim_path_element(path_element);
  }

  public static long hash_value(torrent_status ts) {
    return libtorrent_jni.hash_value(torrent_status.getCPtr(ts), ts);
  }

  public static void throw_invalid_handle() {
    libtorrent_jni.throw_invalid_handle();
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_0(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p), true);
  }

  public static torrent_handle add_feed_item(session s, feed_item fi, add_torrent_params p, error_code ec) {
    return new torrent_handle(libtorrent_jni.add_feed_item__SWIG_1(session.getCPtr(s), s, feed_item.getCPtr(fi), fi, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec), true);
  }

  public static int type() {
    return libtorrent_jni.type();
  }

  public static int category() {
    return libtorrent_jni.category();
  }

  public static String what() {
    return libtorrent_jni.what();
  }

  public static boolean is_read_operation(disk_io_job j) {
    return libtorrent_jni.is_read_operation(disk_io_job.getCPtr(j), j);
  }

  public static boolean operation_has_buffer(disk_io_job j) {
    return libtorrent_jni.operation_has_buffer(disk_io_job.getCPtr(j), j);
  }

  public static int source_rank(int source_bitmask) {
    return libtorrent_jni.source_rank(source_bitmask);
  }

  public static session_settings min_memory_usage() {
    return new session_settings(libtorrent_jni.min_memory_usage(), true);
  }

  public static session_settings high_performance_seed() {
    return new session_settings(libtorrent_jni.high_performance_seed(), true);
  }

  public static boolean is_ok_status(int http_status) {
    return libtorrent_jni.is_ok_status(http_status);
  }

  public static boolean is_redirect(int http_status) {
    return libtorrent_jni.is_redirect(http_status);
  }

  public static String resolve_redirect_location(String referrer, String location) {
    return libtorrent_jni.resolve_redirect_location(referrer, location);
  }

  public static int plus_one(int val) {
    return libtorrent_jni.plus_one(val);
  }

  public static int minus_one(int val) {
    return libtorrent_jni.minus_one(val);
  }

  public static int lazy_bdecode(String start, String end, lazy_entry ret, error_code ec, SWIGTYPE_p_int error_pos, int depth_limit, int item_limit) {
    return libtorrent_jni.lazy_bdecode__SWIG_0(start, end, lazy_entry.getCPtr(ret), ret, error_code.getCPtr(ec), ec, SWIGTYPE_p_int.getCPtr(error_pos), depth_limit, item_limit);
  }

  public static int lazy_bdecode(String start, String end, lazy_entry ret, error_code ec, SWIGTYPE_p_int error_pos, int depth_limit) {
    return libtorrent_jni.lazy_bdecode__SWIG_1(start, end, lazy_entry.getCPtr(ret), ret, error_code.getCPtr(ec), ec, SWIGTYPE_p_int.getCPtr(error_pos), depth_limit);
  }

  public static int lazy_bdecode(String start, String end, lazy_entry ret, error_code ec, SWIGTYPE_p_int error_pos) {
    return libtorrent_jni.lazy_bdecode__SWIG_2(start, end, lazy_entry.getCPtr(ret), ret, error_code.getCPtr(ec), ec, SWIGTYPE_p_int.getCPtr(error_pos));
  }

  public static int lazy_bdecode(String start, String end, lazy_entry ret, error_code ec) {
    return libtorrent_jni.lazy_bdecode__SWIG_3(start, end, lazy_entry.getCPtr(ret), ret, error_code.getCPtr(ec), ec);
  }

  public static String print_entry(lazy_entry e, boolean single_line, int indent) {
    return libtorrent_jni.print_entry__SWIG_0(lazy_entry.getCPtr(e), e, single_line, indent);
  }

  public static String print_entry(lazy_entry e, boolean single_line) {
    return libtorrent_jni.print_entry__SWIG_1(lazy_entry.getCPtr(e), e, single_line);
  }

  public static String print_entry(lazy_entry e) {
    return libtorrent_jni.print_entry__SWIG_2(lazy_entry.getCPtr(e), e);
  }

  public static error_category get_bdecode_category() {
    return new error_category(libtorrent_jni.get_bdecode_category(), false);
  }

  public static String parse_int(String start, String end, char delimiter, SWIGTYPE_p_long_long val, SWIGTYPE_p_bdecode_errors__error_code_enum ec) {
    return libtorrent_jni.parse_int(start, end, delimiter, SWIGTYPE_p_long_long.getCPtr(val), SWIGTYPE_p_bdecode_errors__error_code_enum.getCPtr(ec));
  }

  public static int gzip_header(String buf, int size) {
    return libtorrent_jni.gzip_header(buf, size);
  }

  public static void stat_file(String f, file_status s, error_code ec, int flags) {
    libtorrent_jni.stat_file__SWIG_0(f, file_status.getCPtr(s), s, error_code.getCPtr(ec), ec, flags);
  }

  public static void stat_file(String f, file_status s, error_code ec) {
    libtorrent_jni.stat_file__SWIG_1(f, file_status.getCPtr(s), s, error_code.getCPtr(ec), ec);
  }

  public static void rename(String f, String newf, error_code ec) {
    libtorrent_jni.rename(f, newf, error_code.getCPtr(ec), ec);
  }

  public static void create_directories(String f, error_code ec) {
    libtorrent_jni.create_directories(f, error_code.getCPtr(ec), ec);
  }

  public static void create_directory(String f, error_code ec) {
    libtorrent_jni.create_directory(f, error_code.getCPtr(ec), ec);
  }

  public static void remove_all(String f, error_code ec) {
    libtorrent_jni.remove_all(f, error_code.getCPtr(ec), ec);
  }

  public static void remove(String f, error_code ec) {
    libtorrent_jni.remove(f, error_code.getCPtr(ec), ec);
  }

  public static boolean exists(String f) {
    return libtorrent_jni.exists(f);
  }

  public static long file_size(String f) {
    return libtorrent_jni.file_size(f);
  }

  public static boolean is_directory(String f, error_code ec) {
    return libtorrent_jni.is_directory(f, error_code.getCPtr(ec), ec);
  }

  public static void recursive_copy(String old_path, String new_path, error_code ec) {
    libtorrent_jni.recursive_copy(old_path, new_path, error_code.getCPtr(ec), ec);
  }

  public static void copy_file(String f, String newf, error_code ec) {
    libtorrent_jni.copy_file(f, newf, error_code.getCPtr(ec), ec);
  }

  public static String split_path(String f) {
    return libtorrent_jni.split_path(f);
  }

  public static String next_path_element(String p) {
    return libtorrent_jni.next_path_element(p);
  }

  public static String extension(String f) {
    return libtorrent_jni.extension(f);
  }

  public static String remove_extension(String f) {
    return libtorrent_jni.remove_extension(f);
  }

  public static void replace_extension(String f, String ext) {
    libtorrent_jni.replace_extension(f, ext);
  }

  public static boolean is_root_path(String f) {
    return libtorrent_jni.is_root_path(f);
  }

  public static String parent_path(String f) {
    return libtorrent_jni.parent_path(f);
  }

  public static boolean has_parent_path(String f) {
    return libtorrent_jni.has_parent_path(f);
  }

  public static String filename(String f) {
    return libtorrent_jni.filename(f);
  }

  public static String combine_path(String lhs, String rhs) {
    return libtorrent_jni.combine_path(lhs, rhs);
  }

  public static String complete(String f) {
    return libtorrent_jni.complete(f);
  }

  public static boolean is_complete(String f) {
    return libtorrent_jni.is_complete(f);
  }

  public static String current_working_directory() {
    return libtorrent_jni.current_working_directory();
  }

  public static String time_now_string() {
    return libtorrent_jni.time_now_string();
  }

  public static String log_time() {
    return libtorrent_jni.log_time();
  }

  public static SWIGTYPE_p_boost__posix_time__ptime time_now() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.time_now(), false);
  }

  public static SWIGTYPE_p_boost__posix_time__ptime time_now_hires() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.time_now_hires(), true);
  }

  public static SWIGTYPE_p_boost__posix_time__ptime min_time() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.min_time(), true);
  }

  public static SWIGTYPE_p_boost__posix_time__ptime max_time() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.max_time(), true);
  }

  public static SWIGTYPE_p_boost__posix_time__time_duration seconds(long s) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.seconds(s), true);
  }

  public static SWIGTYPE_p_boost__posix_time__time_duration milliseconds(long s) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.milliseconds(s), true);
  }

  public static SWIGTYPE_p_boost__posix_time__time_duration microsec(long s) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.microsec(s), true);
  }

  public static SWIGTYPE_p_boost__posix_time__time_duration minutes(long s) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.minutes(s), true);
  }

  public static SWIGTYPE_p_boost__posix_time__time_duration hours(long s) {
    return new SWIGTYPE_p_boost__posix_time__time_duration(libtorrent_jni.hours(s), true);
  }

  public static long total_seconds(SWIGTYPE_p_boost__posix_time__time_duration td) {
    return libtorrent_jni.total_seconds(SWIGTYPE_p_boost__posix_time__time_duration.getCPtr(td));
  }

  public static long total_milliseconds(SWIGTYPE_p_boost__posix_time__time_duration td) {
    return libtorrent_jni.total_milliseconds(SWIGTYPE_p_boost__posix_time__time_duration.getCPtr(td));
  }

  public static long total_microseconds(SWIGTYPE_p_boost__posix_time__time_duration td) {
    return libtorrent_jni.total_microseconds(SWIGTYPE_p_boost__posix_time__time_duration.getCPtr(td));
  }

  public static String unescape_string(String s, error_code ec) {
    return libtorrent_jni.unescape_string(s, error_code.getCPtr(ec), ec);
  }

  public static String escape_string(String str, int len) {
    return libtorrent_jni.escape_string(str, len);
  }

  public static String escape_path(String str, int len) {
    return libtorrent_jni.escape_path(str, len);
  }

  public static String maybe_url_encode(String url) {
    return libtorrent_jni.maybe_url_encode(url);
  }

  public static boolean need_encoding(String str, int len) {
    return libtorrent_jni.need_encoding(str, len);
  }

  public static String base64encode(String s) {
    return libtorrent_jni.base64encode(s);
  }

  public static String base32encode(String s) {
    return libtorrent_jni.base32encode(s);
  }

  public static String base32decode(String s) {
    return libtorrent_jni.base32decode(s);
  }

  public static void convert_path_to_posix(String path) {
    libtorrent_jni.convert_path_to_posix(path);
  }

  public static String read_until(String str, char delim, String end) {
    return libtorrent_jni.read_until(str, delim, end);
  }

  public static int hex_to_int(char in) {
    return libtorrent_jni.hex_to_int(in);
  }

  public static boolean is_hex(String in, int len) {
    return libtorrent_jni.is_hex(in, len);
  }

  public static String to_hex(String s) {
    return libtorrent_jni.to_hex__SWIG_0(s);
  }

  public static void to_hex(String in, int len, String out) {
    libtorrent_jni.to_hex__SWIG_1(in, len, out);
  }

  public static boolean from_hex(String in, int len, String out) {
    return libtorrent_jni.from_hex(in, len, out);
  }

  public static String convert_to_native(String s) {
    return libtorrent_jni.convert_to_native(s);
  }

  public static String convert_from_native(String s) {
    return libtorrent_jni.convert_from_native(s);
  }

  public static String integer_to_str(String buf, int size, long val) {
    return libtorrent_jni.integer_to_str(buf, size, val);
  }

}
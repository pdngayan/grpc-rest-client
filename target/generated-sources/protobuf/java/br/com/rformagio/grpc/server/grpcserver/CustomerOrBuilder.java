// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomerService.proto

package br.com.rformagio.grpc.server.grpcserver;

public interface CustomerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.rformagio.grpc.server.grpcserver.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <code>string first_name = 2;</code>
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 4;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  java.util.List<java.lang.String>
      getPhoneNumbersList();
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  int getPhoneNumbersCount();
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  java.lang.String getPhoneNumbers(int index);
  /**
   * <code>repeated string phone_numbers = 5;</code>
   */
  com.google.protobuf.ByteString
      getPhoneNumbersBytes(int index);

  /**
   * <pre>
   * Add an age field of type int32
   * </pre>
   *
   * <code>int32 age = 6;</code>
   */
  int getAge();

  /**
   * <pre>
   * Add a balance field of type double
   * </pre>
   *
   * <code>double balance = 7;</code>
   */
  double getBalance();
}

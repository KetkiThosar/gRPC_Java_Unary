// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet.proto

package com.grpc.greet;

public final class Greet {
  private Greet() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GreetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013greet.proto\"1\n\010Greeting\022\022\n\nfirst_name\030" +
      "\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\"+\n\014GreetRequest" +
      "\022\033\n\010greeting\030\001 \001(\0132\t.Greeting\"\037\n\rGreetRe" +
      "sponse\022\016\n\006result\030\001 \001(\t28\n\014GreetService\022(" +
      "\n\005Greet\022\r.GreetRequest\032\016.GreetResponse\"\000" +
      "B\022\n\016com.grpc.greetP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Greeting_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_GreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GreetRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_GreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GreetResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

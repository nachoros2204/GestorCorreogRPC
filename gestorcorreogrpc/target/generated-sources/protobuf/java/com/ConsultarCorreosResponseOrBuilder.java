// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gestorcorreogrpc.proto

package com;

public interface ConsultarCorreosResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ConsultarCorreosResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Lista de correos recibidos por el destinatario
   * </pre>
   *
   * <code>repeated .com.MandarMailRequest correos = 1;</code>
   */
  java.util.List<com.MandarMailRequest> 
      getCorreosList();
  /**
   * <pre>
   * Lista de correos recibidos por el destinatario
   * </pre>
   *
   * <code>repeated .com.MandarMailRequest correos = 1;</code>
   */
  com.MandarMailRequest getCorreos(int index);
  /**
   * <pre>
   * Lista de correos recibidos por el destinatario
   * </pre>
   *
   * <code>repeated .com.MandarMailRequest correos = 1;</code>
   */
  int getCorreosCount();
  /**
   * <pre>
   * Lista de correos recibidos por el destinatario
   * </pre>
   *
   * <code>repeated .com.MandarMailRequest correos = 1;</code>
   */
  java.util.List<? extends com.MandarMailRequestOrBuilder> 
      getCorreosOrBuilderList();
  /**
   * <pre>
   * Lista de correos recibidos por el destinatario
   * </pre>
   *
   * <code>repeated .com.MandarMailRequest correos = 1;</code>
   */
  com.MandarMailRequestOrBuilder getCorreosOrBuilder(
      int index);
}
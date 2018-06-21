// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface UpdateTopicRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.UpdateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  boolean hasTopic();
  /**
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  com.google.pubsub.v1.Topic getTopic();
  /**
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder();

  /**
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

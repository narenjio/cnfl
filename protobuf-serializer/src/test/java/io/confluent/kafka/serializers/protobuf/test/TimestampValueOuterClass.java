// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TimestampValue.proto

package io.confluent.kafka.serializers.protobuf.test;

public final class TimestampValueOuterClass {
  private TimestampValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TimestampValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TimestampValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     * @return The value.
     */
    com.google.protobuf.Timestamp getValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getValueOrBuilder();
  }
  /**
   * <pre>
   * Wrapper message for `Timestamp`.
   * </pre>
   *
   * Protobuf type {@code TimestampValue}
   */
  public  static final class TimestampValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TimestampValue)
      TimestampValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TimestampValue.newBuilder() to construct.
    private TimestampValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TimestampValue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TimestampValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TimestampValue(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (value_ != null) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.internal_static_TimestampValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.internal_static_TimestampValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.class, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp value_;
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return value_ != null;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     * @return The value.
     */
    public com.google.protobuf.Timestamp getValue() {
      return value_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : value_;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp value = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getValueOrBuilder() {
      return getValue();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != null) {
        output.writeMessage(1, getValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue)) {
        return super.equals(obj);
      }
      io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue other = (io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue) obj;

      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Wrapper message for `Timestamp`.
     * </pre>
     *
     * Protobuf type {@code TimestampValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TimestampValue)
        io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.internal_static_TimestampValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.internal_static_TimestampValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.class, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder.class);
      }

      // Construct using io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          value_ = null;
          valueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.internal_static_TimestampValue_descriptor;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getDefaultInstanceForType() {
        return io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue build() {
        io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue buildPartial() {
        io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue result = new io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue(this);
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue) {
          return mergeFrom((io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue other) {
        if (other == io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.getDefaultInstance()) return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Timestamp value_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> valueBuilder_;
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return valueBuilder_ != null || value_ != null;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       * @return The value.
       */
      public com.google.protobuf.Timestamp getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public Builder setValue(com.google.protobuf.Timestamp value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public Builder setValue(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public Builder mergeValue(com.google.protobuf.Timestamp value) {
        if (valueBuilder_ == null) {
          if (value_ != null) {
            value_ =
              com.google.protobuf.Timestamp.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          value_ = null;
          valueBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getValueBuilder() {
        
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : value_;
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.google.protobuf.Timestamp value = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TimestampValue)
    }

    // @@protoc_insertion_point(class_scope:TimestampValue)
    private static final io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue();
    }

    public static io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TimestampValue>
        PARSER = new com.google.protobuf.AbstractParser<TimestampValue>() {
      @java.lang.Override
      public TimestampValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimestampValue(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TimestampValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TimestampValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TimestampValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TimestampValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TimestampValue.proto\032\037google/protobuf/" +
      "timestamp.proto\";\n\016TimestampValue\022)\n\005val" +
      "ue\030\001 \001(\0132\032.google.protobuf.TimestampB.\n," +
      "io.confluent.kafka.serializers.protobuf." +
      "testb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_TimestampValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TimestampValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TimestampValue_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

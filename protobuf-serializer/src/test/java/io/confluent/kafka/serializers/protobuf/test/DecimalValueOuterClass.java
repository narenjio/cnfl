// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DecimalValue.proto

package io.confluent.kafka.serializers.protobuf.test;

public final class DecimalValueOuterClass {
  private DecimalValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DecimalValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DecimalValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return The value.
     */
    io.confluent.protobuf.type.Decimal getValue();
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     */
    io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder();
  }
  /**
   * <pre>
   * Wrapper message for `Decimal`.
   * </pre>
   *
   * Protobuf type {@code DecimalValue}
   */
  public static final class DecimalValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DecimalValue)
      DecimalValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DecimalValue.newBuilder() to construct.
    private DecimalValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DecimalValue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DecimalValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.internal_static_DecimalValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.internal_static_DecimalValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.class, io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private io.confluent.protobuf.type.Decimal value_;
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return value_ != null;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     * @return The value.
     */
    @java.lang.Override
    public io.confluent.protobuf.type.Decimal getValue() {
      return value_ == null ? io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
    }
    /**
     * <pre>
     * The bytes value.
     * </pre>
     *
     * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
     */
    @java.lang.Override
    public io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder() {
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
      getUnknownFields().writeTo(output);
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue)) {
        return super.equals(obj);
      }
      io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue other = (io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue) obj;

      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue parseFrom(
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
    public static Builder newBuilder(io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue prototype) {
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
     * Wrapper message for `Decimal`.
     * </pre>
     *
     * Protobuf type {@code DecimalValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DecimalValue)
        io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.internal_static_DecimalValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.internal_static_DecimalValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.class, io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.Builder.class);
      }

      // Construct using io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

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
        return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.internal_static_DecimalValue_descriptor;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue getDefaultInstanceForType() {
        return io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue build() {
        io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue buildPartial() {
        io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue result = new io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue(this);
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
        if (other instanceof io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue) {
          return mergeFrom((io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue other) {
        if (other == io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue.getDefaultInstance()) return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getValueFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private io.confluent.protobuf.type.Decimal value_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder> valueBuilder_;
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
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
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       * @return The value.
       */
      public io.confluent.protobuf.type.Decimal getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder setValue(io.confluent.protobuf.type.Decimal value) {
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
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder setValue(
          io.confluent.protobuf.type.Decimal.Builder builderForValue) {
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
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public Builder mergeValue(io.confluent.protobuf.type.Decimal value) {
        if (valueBuilder_ == null) {
          if (value_ != null) {
            value_ =
              io.confluent.protobuf.type.Decimal.newBuilder(value_).mergeFrom(value).buildPartial();
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
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
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
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public io.confluent.protobuf.type.Decimal.Builder getValueBuilder() {
        
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      public io.confluent.protobuf.type.DecimalOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              io.confluent.protobuf.type.Decimal.getDefaultInstance() : value_;
        }
      }
      /**
       * <pre>
       * The bytes value.
       * </pre>
       *
       * <code>.confluent.type.Decimal value = 1 [(.confluent.field_meta) = { ... }</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.confluent.protobuf.type.Decimal, io.confluent.protobuf.type.Decimal.Builder, io.confluent.protobuf.type.DecimalOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:DecimalValue)
    }

    // @@protoc_insertion_point(class_scope:DecimalValue)
    private static final io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue();
    }

    public static io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DecimalValue>
        PARSER = new com.google.protobuf.AbstractParser<DecimalValue>() {
      @java.lang.Override
      public DecimalValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<DecimalValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DecimalValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.DecimalValueOuterClass.DecimalValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DecimalValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DecimalValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DecimalValue.proto\032\024confluent/meta.pro" +
      "to\032\034confluent/type/decimal.proto\"e\n\014Deci" +
      "malValue\022G\n\005value\030\001 \001(\0132\027.confluent.type" +
      ".DecimalB\037\202D\034\022\016\n\tprecision\022\0018\022\n\n\005scale\022\001" +
      "3:\014\202D\t\n\007messageB.\n,io.confluent.kafka.se" +
      "rializers.protobuf.testb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.confluent.protobuf.MetaProto.getDescriptor(),
          io.confluent.protobuf.type.DecimalProto.getDescriptor(),
        });
    internal_static_DecimalValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DecimalValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DecimalValue_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.confluent.protobuf.MetaProto.fieldMeta);
    registry.add(io.confluent.protobuf.MetaProto.messageMeta);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.confluent.protobuf.MetaProto.getDescriptor();
    io.confluent.protobuf.type.DecimalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

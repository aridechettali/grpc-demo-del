// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Author.proto

package com.grpc.generated;

public final class AuthorOuterClass {
  private AuthorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AuthorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.grpc.common.Author)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <code>string firstName = 2;</code>
     */
    java.lang.String getFirstName();
    /**
     * <code>string firstName = 2;</code>
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    /**
     * <code>string lastName = 3;</code>
     */
    java.lang.String getLastName();
    /**
     * <code>string lastName = 3;</code>
     */
    com.google.protobuf.ByteString
        getLastNameBytes();
  }
  /**
   * Protobuf type {@code com.grpc.common.Author}
   */
  public  static final class Author extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.grpc.common.Author)
      AuthorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Author.newBuilder() to construct.
    private Author(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Author() {
      id_ = 0L;
      firstName_ = "";
      lastName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Author(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              firstName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              lastName_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.grpc.generated.AuthorOuterClass.internal_static_com_grpc_common_Author_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.generated.AuthorOuterClass.internal_static_com_grpc_common_Author_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.generated.AuthorOuterClass.Author.class, com.grpc.generated.AuthorOuterClass.Author.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int FIRSTNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object firstName_;
    /**
     * <code>string firstName = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      }
    }
    /**
     * <code>string firstName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object lastName_;
    /**
     * <code>string lastName = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      }
    }
    /**
     * <code>string lastName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
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
      if (!(obj instanceof com.grpc.generated.AuthorOuterClass.Author)) {
        return super.equals(obj);
      }
      com.grpc.generated.AuthorOuterClass.Author other = (com.grpc.generated.AuthorOuterClass.Author) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && getFirstName()
          .equals(other.getFirstName());
      result = result && getLastName()
          .equals(other.getLastName());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstName().hashCode();
      hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLastName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.grpc.generated.AuthorOuterClass.Author parseFrom(
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
    public static Builder newBuilder(com.grpc.generated.AuthorOuterClass.Author prototype) {
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
     * Protobuf type {@code com.grpc.common.Author}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.grpc.common.Author)
        com.grpc.generated.AuthorOuterClass.AuthorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.grpc.generated.AuthorOuterClass.internal_static_com_grpc_common_Author_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.grpc.generated.AuthorOuterClass.internal_static_com_grpc_common_Author_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.grpc.generated.AuthorOuterClass.Author.class, com.grpc.generated.AuthorOuterClass.Author.Builder.class);
      }

      // Construct using com.grpc.common.AuthorOuterClass.Author.newBuilder()
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
        id_ = 0L;

        firstName_ = "";

        lastName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.grpc.generated.AuthorOuterClass.internal_static_com_grpc_common_Author_descriptor;
      }

      @java.lang.Override
      public com.grpc.generated.AuthorOuterClass.Author getDefaultInstanceForType() {
        return com.grpc.generated.AuthorOuterClass.Author.getDefaultInstance();
      }

      @java.lang.Override
      public com.grpc.generated.AuthorOuterClass.Author build() {
        com.grpc.generated.AuthorOuterClass.Author result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.grpc.generated.AuthorOuterClass.Author buildPartial() {
        com.grpc.generated.AuthorOuterClass.Author result = new com.grpc.generated.AuthorOuterClass.Author(this);
        result.id_ = id_;
        result.firstName_ = firstName_;
        result.lastName_ = lastName_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.grpc.generated.AuthorOuterClass.Author) {
          return mergeFrom((com.grpc.generated.AuthorOuterClass.Author)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.grpc.generated.AuthorOuterClass.Author other) {
        if (other == com.grpc.generated.AuthorOuterClass.Author.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getFirstName().isEmpty()) {
          firstName_ = other.firstName_;
          onChanged();
        }
        if (!other.getLastName().isEmpty()) {
          lastName_ = other.lastName_;
          onChanged();
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
        com.grpc.generated.AuthorOuterClass.Author parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.grpc.generated.AuthorOuterClass.Author) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object firstName_ = "";
      /**
       * <code>string firstName = 2;</code>
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string firstName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string firstName = 2;</code>
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string firstName = 2;</code>
       */
      public Builder clearFirstName() {
        
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>string firstName = 2;</code>
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        firstName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lastName_ = "";
      /**
       * <code>string lastName = 3;</code>
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string lastName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string lastName = 3;</code>
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string lastName = 3;</code>
       */
      public Builder clearLastName() {
        
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>string lastName = 3;</code>
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lastName_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.grpc.common.Author)
    }

    // @@protoc_insertion_point(class_scope:com.grpc.common.Author)
    private static final com.grpc.generated.AuthorOuterClass.Author DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.grpc.generated.AuthorOuterClass.Author();
    }

    public static com.grpc.generated.AuthorOuterClass.Author getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Author>
        PARSER = new com.google.protobuf.AbstractParser<Author>() {
      @java.lang.Override
      public Author parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Author(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Author> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Author> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.grpc.generated.AuthorOuterClass.Author getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_common_Author_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_common_Author_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Author.proto\022\017com.grpc.common\"9\n\006Autho" +
      "r\022\n\n\002id\030\001 \001(\003\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010last" +
      "Name\030\003 \001(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_grpc_common_Author_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_common_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_common_Author_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

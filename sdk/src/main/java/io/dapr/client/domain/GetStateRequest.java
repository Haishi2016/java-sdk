/*
 * Copyright (c) Microsoft Corporation.
 * Licensed under the MIT License.
 */

package io.dapr.client.domain;

import io.grpc.Context;

/**
 * A request to get a state by key.
 */
public class GetStateRequest {

  private String stateStoreName;

  private String key;

  private String etag;

  private StateOptions stateOptions;

  private Context context;

  public String getStateStoreName() {
    return stateStoreName;
  }

  void setStateStoreName(String stateStoreName) {
    this.stateStoreName = stateStoreName;
  }

  public String getKey() {
    return key;
  }

  void setKey(String key) {
    this.key = key;
  }

  public String getEtag() {
    return etag;
  }

  void setEtag(String etag) {
    this.etag = etag;
  }

  public StateOptions getStateOptions() {
    return stateOptions;
  }

  void setStateOptions(StateOptions stateOptions) {
    this.stateOptions = stateOptions;
  }

  public Context getContext() {
    return context;
  }

  void setContext(Context context) {
    this.context = context;
  }
}

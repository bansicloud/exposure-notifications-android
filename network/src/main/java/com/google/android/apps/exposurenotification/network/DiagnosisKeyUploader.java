/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.google.android.apps.exposurenotification.network;

import android.content.Context;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/**
 * A class to encapsulate uploading Diagnosis Keys to the key sharing service.
 */
public class DiagnosisKeyUploader {
  private static final String TAG = "DiagnosisKeyUploader";
  public static final String DEFAULT_UPLOAD_URI = "https://example.com";

  private final Context context;

  DiagnosisKeyUploader(Context context) {
    this.context = context;
  }

  ListenableFuture<Void> upload(List<DiagnosisKey> diagnosisKeys) {
    return Futures.immediateFuture(null);
  }
}

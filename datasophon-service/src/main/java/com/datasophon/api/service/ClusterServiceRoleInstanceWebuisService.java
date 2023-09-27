/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.datasophon.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.datasophon.common.utils.Result;
import com.datasophon.dao.entity.ClusterServiceRoleInstanceWebuis;

import java.util.ArrayList;
import java.util.List;

/**
 * 集群服务角色对应web ui表 
 *
 * @author gaodayu
 * @email gaodayu2022@163.com
 * @date 2022-04-24 16:25:17
 */
public interface ClusterServiceRoleInstanceWebuisService extends IService<ClusterServiceRoleInstanceWebuis> {

    Result getWebUis(Integer serviceInstanceId);

    void removeByServiceInsId(Integer serviceInstanceId);

    void updateWebUiToActive(Integer id);

    ClusterServiceRoleInstanceWebuis getRoleInstanceWebUi(Integer roleInstanceId);

    void removeByRoleInsIds(ArrayList<Integer> needRemoveList);

    void updateWebUiToStandby(Integer id);

    List<ClusterServiceRoleInstanceWebuis> listWebUisByServiceInstanceId(Integer serviceInstanceId);
}
/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseVersion extends AbstractModel {

    /**
    * 配置发布的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Active")
    @Expose
    private Boolean Active;

    /**
    * 配置发布的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 配置发布的命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 配置发布的分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 配置发布的文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 配置发布的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 配置发布的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置发布的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 配置发布的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Active 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getActive() {
        return this.Active;
    }

    /**
     * Set 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Active 是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    /**
     * Get 配置发布的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 配置发布的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置发布的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 配置发布的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 配置发布的命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 配置发布的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 配置发布的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 配置发布的命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 配置发布的分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group 配置发布的分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 配置发布的分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group 配置发布的分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 配置发布的文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 配置发布的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 配置发布的文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 配置发布的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ReleaseVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseVersion(ReleaseVersion source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Active != null) {
            this.Active = new Boolean(source.Active);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}


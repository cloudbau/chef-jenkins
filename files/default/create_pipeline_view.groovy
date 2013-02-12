/*
#
# Cookbook Name:: jenkins
# Based on hudson
# File:: node_info
#
# Author:: Thomas Kadauke <t.kadauke@cloudbau.de>
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
*/

import hudson.slaves.*
import hudson.model.*
import jenkins.model.*
import jenkins.*
import au.com.centrumsystems.hudson.plugin.buildpipeline.*

view = Hudson.instance.getView(args[0]) as View

if (view == null) {
  hudson.model.Hudson.instance.addView(new au.com.centrumsystems.hudson.plugin.buildpipeline.BuildPipelineView(args[0], "", args[1], "1", true))
}

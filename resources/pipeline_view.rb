#
# Cookbook Name:: jenkins
# Based on hudson
# Resource:: job
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

actions :create, :update

attribute :job_name, :kind_of => String

def initialize(name, run_context=nil)
  super
  @action = :update
end

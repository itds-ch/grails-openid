/*
 * Copyright 2004-2005 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
class OpenidGrailsPlugin {
    def version = "0.4.3"
    def dependsOn = [:]
    def author = "Marcel Overdijk, Matthias Bohlen, Moritz Kobel"
    def authorEmail = "marceloverdijk@gmail.com, mbohlen@mbohlen.de, moritz.kobel@itds.ch"
    def title = "OpenID"
    def description = "Provides simple authentication using OpenID"
    def documentation = "http://grails.org/plugin/openid"
	def scm = [ url: 'https://github.com/mkobel/grails-openid'  ]
	
    def doWithSpring = {
         consumerManager(org.openid4java.consumer.ConsumerManager)
    }
}

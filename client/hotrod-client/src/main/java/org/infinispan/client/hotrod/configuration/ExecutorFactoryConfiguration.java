/*
 * Copyright 2011 Red Hat, Inc. and/or its affiliates.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA
 */
package org.infinispan.client.hotrod.configuration;

import org.infinispan.configuration.AbstractTypedPropertiesConfiguration;
import org.infinispan.executors.ExecutorFactory;
import org.infinispan.util.TypedProperties;

/**
 * ExecutorFactoryConfiguration.
 *
 * @author Tristan Tarrant
 * @since 5.3
 */
public class ExecutorFactoryConfiguration extends AbstractTypedPropertiesConfiguration {

   private final Class<? extends ExecutorFactory> factoryClass;
   private final ExecutorFactory factory;

   ExecutorFactoryConfiguration(Class<? extends ExecutorFactory> factoryClass, TypedProperties properties) {
      super(properties);
      this.factoryClass = factoryClass;
      this.factory = null;
   }

   ExecutorFactoryConfiguration(ExecutorFactory factory, TypedProperties properties) {
      super(properties);
      this.factory = factory;
      this.factoryClass = null;
   }

   public Class<? extends ExecutorFactory> factoryClass() {
      return factoryClass;
   }

   public ExecutorFactory factory() {
      return factory;
   }

   @Override
   public String toString() {
      return "ExecutorFactoryConfiguration [factoryClass=" + factoryClass + ", factory=" + factory + ", properties()=" + properties() + "]";
   }

}
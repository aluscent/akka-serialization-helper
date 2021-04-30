package org.virtuslab.akkasaferserializer

import scala.tools.nsc.{Global, Phase}
import scala.tools.nsc.plugins.{Plugin, PluginComponent}

class SaferSerializerPlugin(override val global: Global) extends Plugin {
  override val name: String = "safer-serializer-plugin"
  override val description: String = "checks for Behavior[A] and ActorRef[A]"
  override val components: List[PluginComponent] = List(new SaferSerializerPluginComponent(global))
}

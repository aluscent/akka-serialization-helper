package org.virtuslab.akkasaferserializer.model

import io.bullet.borer.Codec
import io.bullet.borer.derivation.MapBasedCodecs.{deriveAllCodecs, deriveCodec}

trait Codecs {
  implicit val annotationCodec: Codec[Annotation] = deriveCodec[Annotation]
  implicit val fieldCodec: Codec[Field] = deriveCodec[Field]
  implicit val typeDefinitionCodec: Codec[TypeDefinition] = deriveCodec[TypeDefinition]
}

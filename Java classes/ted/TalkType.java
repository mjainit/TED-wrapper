package ecologylab.semantics.generated.library.ted;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.ted.TalkType;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Main TED talk type class
 */ 
@simpl_inherit
public class TalkType extends CompoundDocument
{
	/** 
	 *Name of the TED event
	 */ 
	@simpl_scalar
	private MetadataString event;

	/** 
	 *Short Introduction of speaker
	 */ 
	@simpl_scalar
	@simpl_tag("Speaker_bio")
	private MetadataString SpeakerBio;

	/** 
	 *Full transcript of the talk
	 */ 
	@simpl_scalar
	@simpl_tag("Transcript")
	private MetadataString Transcript;

	/** 
	 *Total number of comments
	 */ 
	@simpl_scalar
	@simpl_tag("Total_comments")
	private MetadataInteger TotalComments;

	/** 
	 *Total number of views
	 */ 
	@simpl_scalar
	@simpl_tag("Total_views")
	private MetadataInteger TotalViews;

	/** 
	 *Popular quote form the talk
	 */ 
	@simpl_scalar
	@simpl_tag("Quote_from_the_talk")
	private MetadataString QuoteFromTheTalk;

	/** 
	 *Tags related to the talk
	 */ 
	@simpl_collection("talk_type")
	@simpl_tag("Related_tags")
	@mm_name("Related_tags")
	private List<TalkType> RelatedTags;

	/** 
	 *Themes related to the talk
	 */ 
	@simpl_collection("talk_type")
	@simpl_tag("Related_themes")
	@mm_name("Related_themes")
	private List<TalkType> RelatedThemes;

	/** 
	 *Simmiler talks
	 */ 
	@simpl_collection("talk_type")
	@simpl_tag("Simmiler_talks")
	@mm_name("Simmiler_talks")
	private List<TalkType> SimmilerTalks;

	public TalkType()
	{ super(); }

	public TalkType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	event()
	{
		MetadataString	result = this.event;
		if (result == null)
		{
			result = new MetadataString();
			this.event = result;
		}
		return result;
	}

	public String getEvent()
	{
		return this.event == null ? null : event().getValue();
	}

	public MetadataString getEventMetadata()
	{
		return event;
	}

	public void setEvent(String event)
	{
		if (event != null)
			this.event().setValue(event);
	}

	public void setEventMetadata(MetadataString event)
	{
		this.event = event;
	}

	public MetadataString	SpeakerBio()
	{
		MetadataString	result = this.SpeakerBio;
		if (result == null)
		{
			result = new MetadataString();
			this.SpeakerBio = result;
		}
		return result;
	}

	public String getSpeakerBio()
	{
		return this.SpeakerBio == null ? null : SpeakerBio().getValue();
	}

	public MetadataString getSpeakerBioMetadata()
	{
		return SpeakerBio;
	}

	public void setSpeakerBio(String SpeakerBio)
	{
		if (SpeakerBio != null)
			this.SpeakerBio().setValue(SpeakerBio);
	}

	public void setSpeakerBioMetadata(MetadataString SpeakerBio)
	{
		this.SpeakerBio = SpeakerBio;
	}

	public MetadataString	Transcript()
	{
		MetadataString	result = this.Transcript;
		if (result == null)
		{
			result = new MetadataString();
			this.Transcript = result;
		}
		return result;
	}

	public String getTranscript()
	{
		return this.Transcript == null ? null : Transcript().getValue();
	}

	public MetadataString getTranscriptMetadata()
	{
		return Transcript;
	}

	public void setTranscript(String Transcript)
	{
		if (Transcript != null)
			this.Transcript().setValue(Transcript);
	}

	public void setTranscriptMetadata(MetadataString Transcript)
	{
		this.Transcript = Transcript;
	}

	public MetadataInteger	TotalComments()
	{
		MetadataInteger	result = this.TotalComments;
		if (result == null)
		{
			result = new MetadataInteger();
			this.TotalComments = result;
		}
		return result;
	}

	public Integer getTotalComments()
	{
		return this.TotalComments == null ? 0 : TotalComments().getValue();
	}

	public MetadataInteger getTotalCommentsMetadata()
	{
		return TotalComments;
	}

	public void setTotalComments(Integer TotalComments)
	{
		if (TotalComments != 0)
			this.TotalComments().setValue(TotalComments);
	}

	public void setTotalCommentsMetadata(MetadataInteger TotalComments)
	{
		this.TotalComments = TotalComments;
	}

	public MetadataInteger	TotalViews()
	{
		MetadataInteger	result = this.TotalViews;
		if (result == null)
		{
			result = new MetadataInteger();
			this.TotalViews = result;
		}
		return result;
	}

	public Integer getTotalViews()
	{
		return this.TotalViews == null ? 0 : TotalViews().getValue();
	}

	public MetadataInteger getTotalViewsMetadata()
	{
		return TotalViews;
	}

	public void setTotalViews(Integer TotalViews)
	{
		if (TotalViews != 0)
			this.TotalViews().setValue(TotalViews);
	}

	public void setTotalViewsMetadata(MetadataInteger TotalViews)
	{
		this.TotalViews = TotalViews;
	}

	public MetadataString	QuoteFromTheTalk()
	{
		MetadataString	result = this.QuoteFromTheTalk;
		if (result == null)
		{
			result = new MetadataString();
			this.QuoteFromTheTalk = result;
		}
		return result;
	}

	public String getQuoteFromTheTalk()
	{
		return this.QuoteFromTheTalk == null ? null : QuoteFromTheTalk().getValue();
	}

	public MetadataString getQuoteFromTheTalkMetadata()
	{
		return QuoteFromTheTalk;
	}

	public void setQuoteFromTheTalk(String QuoteFromTheTalk)
	{
		if (QuoteFromTheTalk != null)
			this.QuoteFromTheTalk().setValue(QuoteFromTheTalk);
	}

	public void setQuoteFromTheTalkMetadata(MetadataString QuoteFromTheTalk)
	{
		this.QuoteFromTheTalk = QuoteFromTheTalk;
	}

	public List<TalkType> getRelatedTags()
	{
		return RelatedTags;
	}

  // lazy evaluation:
  public List<TalkType> RelatedTags()
  {
    if (RelatedTags == null)
      RelatedTags = new ArrayList<TalkType>();
    return RelatedTags;
  }

  // addTo:
  public void addToRelatedTags(TalkType element)
  {
    RelatedTags().add(element);
  }

  // size:
  public int RelatedTagsSize()
  {
    return RelatedTags == null ? 0 : RelatedTags.size();
  }

	public void setRelatedTags(List<TalkType> RelatedTags)
	{
		this.RelatedTags = RelatedTags;
	}

	public List<TalkType> getRelatedThemes()
	{
		return RelatedThemes;
	}

  // lazy evaluation:
  public List<TalkType> RelatedThemes()
  {
    if (RelatedThemes == null)
      RelatedThemes = new ArrayList<TalkType>();
    return RelatedThemes;
  }

  // addTo:
  public void addToRelatedThemes(TalkType element)
  {
    RelatedThemes().add(element);
  }

  // size:
  public int RelatedThemesSize()
  {
    return RelatedThemes == null ? 0 : RelatedThemes.size();
  }

	public void setRelatedThemes(List<TalkType> RelatedThemes)
	{
		this.RelatedThemes = RelatedThemes;
	}

	public List<TalkType> getSimmilerTalks()
	{
		return SimmilerTalks;
	}

  // lazy evaluation:
  public List<TalkType> SimmilerTalks()
  {
    if (SimmilerTalks == null)
      SimmilerTalks = new ArrayList<TalkType>();
    return SimmilerTalks;
  }

  // addTo:
  public void addToSimmilerTalks(TalkType element)
  {
    SimmilerTalks().add(element);
  }

  // size:
  public int SimmilerTalksSize()
  {
    return SimmilerTalks == null ? 0 : SimmilerTalks.size();
  }

	public void setSimmilerTalks(List<TalkType> SimmilerTalks)
	{
		this.SimmilerTalks = SimmilerTalks;
	}
}
